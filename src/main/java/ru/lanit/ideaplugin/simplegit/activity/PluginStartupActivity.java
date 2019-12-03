package ru.lanit.ideaplugin.simplegit.activity;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import ru.lanit.ideaplugin.simplegit.SimpleGitPlugin;

public class PluginStartupActivity implements StartupActivity {
    @Override
    public void runActivity(Project project) {
//        project.getMessageBus().connect().subscribe(ProjectLevelVcsManager.VCS_CONFIGURATION_CHANGED, new VcsListener() {});
        System.out.println("Opened project " + project.getBasePath());
        SimpleGitPlugin.getPluginFor(project);

//            DumbService.getInstance(project).runWhenSmart()
    }
}
