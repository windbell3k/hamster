package org.windbell.lab.hamster.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DroolsTest {
    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        //默认自动加载 META-INF/kmodule.xml
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        //kmodule.xml 中定义的 ksession name
        KieSession kieSession = kieContainer.newKieSession("all-rules");
        Applicant applicant = new Applicant("Mr John Smith", 17);
        kieSession.insert(applicant);
        kieSession.fireAllRules();
        kieSession.dispose();
    }

    //规则动态更新
    //加载
    public static void load() throws FileNotFoundException {
        KieServices kieServices = KieServices.Factory.get();
        KieServices ks = KieServices.Factory.get();
        KieFileSystem kfs = ks.newKieFileSystem();
        FileInputStream dtableFileStream = new FileInputStream("dtableFileStream");
        kfs.write("src/main/resources/KBase1/ruleSet1.drl", "stringContainingAValidDRL")
                .write("src/main/resources/dtable.xls",
                        kieServices.getResources().newInputStreamResource(dtableFileStream));

        KieBuilder kieBuilder = ks.newKieBuilder(kfs);
        // Enable executable model
        kieBuilder.buildAll(/*ExecutableModelProject.class*/);
        //assertEquals(0, kieBuilder.getResults().getMessages(Message.Level.ERROR).size());
    }

    //更新
    public static void update() {
        KieServices kieServices = KieServices.Factory.get();
        ReleaseId releaseId = kieServices
                .newReleaseId("com.sample", "my-app", "1.0-SNAPSHOT");
        KieContainer kContainer = kieServices.newKieContainer(releaseId);
        KieScanner kScanner = kieServices.newKieScanner(kContainer);

        // Start KIE scanner for polling the Maven repository every 10 seconds (10000 ms)
        kScanner.start(10000L);
    }
}
