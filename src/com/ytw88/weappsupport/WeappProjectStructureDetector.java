package com.ytw88.weappsupport;

import com.intellij.ide.util.importProject.ProjectDescriptor;
import com.intellij.ide.util.projectWizard.importSources.DetectedProjectRoot;
import com.intellij.ide.util.projectWizard.importSources.ProjectFromSourcesBuilder;
import com.intellij.ide.util.projectWizard.importSources.ProjectStructureDetector;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.Collection;
import java.util.List;

public class WeappProjectStructureDetector extends ProjectStructureDetector {
    @NotNull
    @Override
    public DirectoryProcessingResult detectRoots(@NotNull File file, @NotNull File[] files, @NotNull File file1, @NotNull List<DetectedProjectRoot> list) {
        return null;
    }

    @Override
    public String getDetectorId() {
        return "Weapp";
    }

    @Override
    public void setupProjectStructure(@NotNull Collection<DetectedProjectRoot> roots, @NotNull ProjectDescriptor projectDescriptor, @NotNull ProjectFromSourcesBuilder builder) {

    }
}
