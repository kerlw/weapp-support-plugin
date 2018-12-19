package com.ytw88.weappsupport.wxss;

import com.intellij.openapi.fileTypes.*;
import org.jetbrains.annotations.NotNull;

public class WxssFileTypeFactory extends FileTypeFactory {

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer fileTypeConsumer) {
        fileTypeConsumer.consume(WxssFileType.INSTANCE, "wxss");
    }
}
