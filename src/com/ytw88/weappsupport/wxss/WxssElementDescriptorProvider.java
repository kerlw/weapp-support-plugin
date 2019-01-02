package com.ytw88.weappsupport.wxss;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.css.CssMediaFeatureDescriptor;
import com.intellij.psi.css.CssPropertyDescriptor;
import com.intellij.psi.css.CssSimpleSelector;
import com.intellij.psi.css.descriptor.CssContextType;
import com.intellij.psi.css.descriptor.CssFunctionDescriptor;
import com.intellij.psi.css.descriptor.CssPseudoSelectorDescriptor;
import com.intellij.psi.css.descriptor.value.CssValueDescriptor;
import com.intellij.psi.css.descriptor.value.CssValueValidator;
import com.intellij.psi.css.impl.util.scheme.CssElementDescriptorProviderImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class WxssElementDescriptorProvider extends CssElementDescriptorProviderImpl {
    @Nullable
    @Override
    public CssPropertyDescriptor getPropertyDescriptor(@NotNull String propertyName, @Nullable PsiElement context) {
        CssPropertyDescriptor ret = super.getPropertyDescriptor(propertyName, context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssPseudoSelectorDescriptor> findPseudoSelectorDescriptors(@NotNull String name, @Nullable PsiElement context) {
        Collection ret =  super.findPseudoSelectorDescriptors(name, context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssPropertyDescriptor> findPropertyDescriptors(@NotNull String propertyName, @Nullable PsiElement context) {
        Collection ret =  super.findPropertyDescriptors(propertyName, context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssFunctionDescriptor> findFunctionDescriptors(@NotNull String functionName, @Nullable PsiElement context) {
        Collection ret =  super.findFunctionDescriptors(functionName, context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssMediaFeatureDescriptor> findMediaFeatureDescriptors(@NotNull String mediaFeatureName, @Nullable PsiElement context) {
        Collection ret =  super.findMediaFeatureDescriptors(mediaFeatureName, context);
        return ret;
    }

    @Override
    public boolean isPossibleSelector(@NotNull String selector, @NotNull PsiElement context) {
        boolean ret = super.isPossibleSelector(selector, context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssPseudoSelectorDescriptor> getAllPseudoSelectorDescriptors(@Nullable PsiElement context) {
        Collection ret =super.getAllPseudoSelectorDescriptors(context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssPropertyDescriptor> getAllPropertyDescriptors(@Nullable PsiElement context) {
        Collection ret = super.getAllPropertyDescriptors(context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssMediaFeatureDescriptor> getAllMediaFeatureDescriptors(@Nullable PsiElement context) {
        Collection ret = super.getAllMediaFeatureDescriptors(context);
        return ret;
    }

    @NotNull
    @Override
    public String[] getSimpleSelectors(@NotNull PsiElement context) {
        String[] ret= super.getSimpleSelectors(context);
        return ret;
    }

    @NotNull
    @Override
    public PsiElement[] getDeclarationsForSimpleSelector(@NotNull CssSimpleSelector selector) {
        PsiElement[] ret = super.getDeclarationsForSimpleSelector(selector);
        return ret;
    }

    @NotNull
    @Override
    public PsiReference getStyleReference(PsiElement element, int start, int end, boolean caseSensitive) {
        PsiReference ret = super.getStyleReference(element, start, end, caseSensitive);
        return ret;
    }

    @NotNull
    @Override
    public CssValueValidator getValueValidator() {
        CssValueValidator ret = super.getValueValidator();
        return ret;
    }

    @Override
    public CssContextType getCssContextType(@Nullable PsiElement context) {
        CssContextType ret = super.getCssContextType(context);
        return ret;
    }

    @NotNull
    @Override
    public Collection<? extends CssValueDescriptor> getNamedValueDescriptors(@NotNull String name, @Nullable CssValueDescriptor parent) {
        Collection ret = super.getNamedValueDescriptors(name, parent);
        return ret;
    }
}
