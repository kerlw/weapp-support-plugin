# WeApp Support Plugin 微信小程序支持插件

想要实现一个微信小程序的JetBrain IDE插件，但是经过尝试发现写BNF的Grammar对我来说实在有点困
难了，短时间之内没有可能全面的学习这个东东，近期工作上的事情也还比较忙，只好将这个项目暂时搁置了。

JetBrains的Plugin开发虽然官方有很多文档，但是工程太庞大了，而且这几天学习研究过程中似乎搜索的
结论都提到无法对现有的语言支持做扩展。其实微信小程序的支持，只需要对xml（wxml），css（wxss），
js做一些扩展就可以用了，可惜的是没有发现支持的扩展路径。这两天尝试写wxml的bnf语法文件，已经有点
焦头烂额的感觉。

IDEA官方文档中，对于语言支持插件开发的文档"Part VII - Custom Languages"包括两大部分：

[介绍框架](http://www.jetbrains.org/intellij/sdk/docs/reference_guide/custom_language_support.html)

[具体的教程](http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support_tutorial.html)

## TODO list
近期希望完成以下功能列表，如果有熟悉idea插件开发的大牛能够协助一二自然是最好不过的了。实在是难以找到有效的文档来发现最佳的实现方案。

* [ ] css中增加对rpx单位的支持
* [ ] wxml中增加对wx:if/wx:else/wx:elif的支持
* [ ] 增加对微信小程序工程检查的支持

## 更新日记

### 2018.12.18
今天发现jetbrains还有一个社区的js库定义，专门辅助完善一些js框架的类库定义。可以在`Preferences |
 Languages & Frameworks | JavaScript | Libraries`设置中添加一些library，而且这个设置界面
 直接提供了下载功能，列举了git上该开源项目相关的定义，其中找到三个可能和微信小程序有关的
 * weapp-api
 * wegame-api
 * wexin-app
 
 git上的开源项目地址: [DefinitelyTyped](https://github.com/DefinitelyTyped/DefinitelyTyped)
 
 关于ide的javascript library介绍:
 
  [How WebStorm Works: Completion for JavaScript Libraries](https://blog.jetbrains.com/webstorm/2014/07/how-webstorm-works-completion-for-javascript-libraries/)
  
  [Configuring JavaScript Libraries](https://www.jetbrains.com/help/idea/configuring-javascript-libraries.html)
  
  文2中注明了
  > This feature is only supported in the Ultimate edition.
  
  目前在webstorm中测试过，三个library都可以用，但是weapp-api定义没有wexin-app定义全面
 
 ### 2018.12.19
 终于找到了一个合适的方案来把wexin-app的api添加到plugin，直接添加到javascript的支持
 首先要从IDEA的plugin目录中找到JavascriptLanguage，从其子目录lib中找到
 JavaScriptLanguage.jar，最好是将这个jar包添加到sdk的library中去，这样才能够在开发插件
 的时候使用
 
 在`plugin.xml`中加入
 ```
 <depends>JavaScript</depends>
 ...
 
 <extensions defaultExtensionNs="JavaScript">
     <predefinedLibraryProvider implementation="com.ytw88.weappsupport.WeappJSPredefinedLibraryProvider"/>
 </extensions>
 ```
 * depends不是必须的，这个会使得插件只能在支持Javascript的平台上使用
 * extensions的声明，是为javascript的`extensionPoint：predefinedLibraryProvider`添加实现
 
 #### 弹窗显示内容
 跟怒官方文档的提示，可以在插件代码中使用来弹出对话框，显示一些信息，另外用logger来输出的log暂时没找到显示窗口
 > Messages.showInfoMessage("Message", "Title");
 
 #### 将文件注册为已知类型
 如果是在FileTypeFactory的createFileTypes中使用FileTypeManager的getFileTypeByExtension会导致循环依
 赖的异常，从而使得ide无法启动，需要在/User/Library/Application Support/xxxxx/中找到plugin并删除方可正
 常启动ide。
 
 目前将Wxml文件注册为Html文件，做法是在WxmlFileTypeFactory中直接使用HtmlFileType返回（因为HtmlFileType
 的构造函数都不是public/protected的，故而无法继承），而wxss文件则通过将WxssFileType继承CssFileType来解决
 
 以后可以抽时间继续完善wxml的更多的语法支持，比如
  > * <import .....
  > * <block wx:if/elif/else....
  
  ### 2018.12.20
  更新wxapi的定义
  1. CanvasContext更新接口定义，增加属性定义，增加方法arcTo, clip, createPattern, measureText, setLineDash, 
  setTextBaseline, strokeText, setTransform, transform定义
  2. 增加Worker相关定义
  3. 增加mDNS相关接口定义
  4. 增加wx.compressImage接口定义
  5. 增加FileSystemManager及wx.getFileSystemManager定义
  6. createContext接口标记为deprecated,增加createCanvasContext接口的定义
  
  ### 2018.12.27
  更新canvas相关几个api定义，全部加上this参数的支持
  
  ### 2019.01.02
  看了postcss的部分代码，发现它有用到com.intellij.psi.css.impl包中的部分类，但是在sdk的库中却没有相关类，
  立刻想到和javascript一样，是一个插件库，于是在idea中把sdk编辑了一下，添加了css的插件的jar包，果然可以找到
  相关的类了，也许可以从这里突破实现css中添加rpx单位支持
  
  经过一天的研究，发现大概能够通过css的扩展点定义直接扩展出自定义的属性定义，但是想要增加一个单位的定义却是没有
  路径的。不知道是不是我没有发现可用路径，在论坛提交了一个帖子等着官方回复吧。
  
  ### 2019.01.03
  今天又研究了一天如何实现添加rpx单位支持，感觉又近了一步，但是还是很遥远。主要对psi相关的一整套流程并没有捋清
  楚。官方论坛上我发的帖子并没有得到回复。我在这个事情上话费的时间已经太长了，恐怕要暂时搁置了。实话说idea的各
  个ide做得确实是比较好用的，但是插件开发方面给的支持力度还是远远不足，有点太专业了，而文档对于整体的架构、流程
  的介绍又严重不足，只能从各种插件开源的代码里面去学习，学习成本太高。
  
  ### 2019.01.16
  官方论坛的提问终于得到了答复，遗憾的是，没有方法能够为css添加新的单位支持
  
  [论坛提问帖子](https://intellij-support.jetbrains.com/hc/en-us/community/posts/360002386819-How-can-I-add-additional-unit-token-define-for-CSS-language-)
