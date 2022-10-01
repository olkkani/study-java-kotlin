package com.example.util;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Shell Script , Command 를 실행
 */
public class ShellScriptProcessBuilder {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    String[] shellCommands = new String[3];

    public ShellScriptProcessBuilder(String runCommand){
        shellCommands[2] = runCommand;
    }


    /**
     * Os type  별 쉘 지정
     */
    private void setShellTypeByOSType(){

        String osName = System.getProperty("os.name").toLowerCase();
        log.debug(osName);
        if (osName.startsWith("win")) {
            shellCommands[0] = "cmd.exe";
            shellCommands[1] = "/c";
        } else {
            shellCommands[0] = "sh";
            shellCommands[1] = "-c";
        }
    }

    /**
     * Shell command 실행
     */
    private void runProcessBuilderCommand(){
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(shellCommands);
            Process process = processBuilder.start();

            BufferedReader outReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String line;
            while ((line = outReader.readLine()) != null){
                System.out.println(line);
            }
            while ((line = errorReader.readLine()) != null){
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println(exitCode);


        }catch (Exception e){
            log.error("error", e);
        }
    }

    /**
     * 실행 커맨드를 OS 타입에 맞춰서 실행
     */
    public void runShellCommand() {
        setShellTypeByOSType();
        runProcessBuilderCommand();
    }

}
