// source: http://stackoverflow.com/a/2877813/2338327
//
// This is a little helper process for spawning child processes. Spawning this
// intermediate "process spawner" process and using it to spawn child processes
// instead of spawning them directly from the main process supposedly cuts down
// on child process memory usage.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProcessHelper
{
    public static void main(String[] args)
    {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         String command;
         try {
           while((command = in.readLine()) != null)
           {
             Runtime runtime = Runtime.getRuntime();
             Process process = runtime.exec(command);
             process.getInputStream().close();
             process.getOutputStream().close();
             process.getErrorStream().close();
           }
         } catch (IOException e) {
           System.out.println("ERROR: " + e.getMessage());
           System.exit(1);
         }
    }
}
