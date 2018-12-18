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
 