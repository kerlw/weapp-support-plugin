package com.ytw88.weappsupport.wxml;

import com.intellij.ide.highlighter.HtmlFileType;
import com.intellij.openapi.fileTypes.*;
import com.ytw88.weappsupport.wxml.psi.WxmlTypes;
import org.jetbrains.annotations.NotNull;

public class WxmlFileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
//        FileType ft = FileTypeManager.getInstance().getFileTypeByExtension("html");
//        if (ft instanceof UnknownFileType)
            fileTypeConsumer.consume(HtmlFileType.INSTANCE, "wxml");
//        else
//            fileTypeConsumer.consume(ft, "wxml");
    }
}
