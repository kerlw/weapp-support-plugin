package com.ytw88.weappsupport.wxml;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import com.ytw88.weappsupport.IconsLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class WxmlColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Comment", WxmlSyntaxHighlighter.COMMENT),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return IconsLoader.WXML_ICON;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new WxmlSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "<!-- This is a wxml for weapp -->\n" +
                "<view style='display: flex;'>\n" +
                "   <block wx:if='{{condition}}>\n" +
                "       <text>condition eq true</text>\n" +
                "   </block>\n" +
                "   <block wx:else>\n" +
                "       <text>condition eq false</text>\n" +
                "   </block>\n" +
                "</view>";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return new ColorDescriptor[0];
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Wxml";
    }
}
