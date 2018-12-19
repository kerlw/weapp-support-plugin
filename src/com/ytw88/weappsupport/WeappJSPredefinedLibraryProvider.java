package com.ytw88.weappsupport;

import com.intellij.lang.javascript.library.JSPredefinedLibraryProvider;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.webcore.libraries.ScriptingLibraryModel;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeappJSPredefinedLibraryProvider extends JSPredefinedLibraryProvider {
    @NonNls
    private static final String LIBRARY_NAME = "weapp-api";

    @NonNls
    private String[] jsFiles = {
            "/lib/weixin-app/index.d.ts",
            "/lib/weixin-app/tsconfig.json",
            "/lib/weixin-app/tslint.json",
            "/lib/weixin-app/weixin-app-tests.ts"
    };

    @NotNull
    @Override
    public ScriptingLibraryModel[] getPredefinedLibraries(@NotNull Project project) {
        Set<VirtualFile> virtualFiles = getVirtualFiles();

        ScriptingLibraryModel scriptingLibraryModel = ScriptingLibraryModel.createPredefinedLibrary(LIBRARY_NAME,
                virtualFiles.toArray(new VirtualFile[virtualFiles.size()]), true);

        return new ScriptingLibraryModel[]{scriptingLibraryModel};
    }

    @NotNull
    @Override
    public Set<VirtualFile> getRequiredLibraryFilesToIndex() {
        return getVirtualFiles();
    }

    @NotNull
    @Override
    public Set<VirtualFile> getRequiredLibraryFilesForResolve(@NotNull Project project) {
        return getVirtualFiles();
    }

    private Set<VirtualFile> getVirtualFiles() {
        Set<VirtualFile> virtualFiles = new HashSet<>();

        final List<String> names = new ArrayList<String>();
        for (String libFileName : this.jsFiles) {
            URL fileUrl = WeappJSPredefinedLibraryProvider.class.getResource(libFileName);
            names.add(fileUrl.toString());
            virtualFiles.add(VfsUtil.findFileByURL(fileUrl));
        }
        return virtualFiles;
    }
}
