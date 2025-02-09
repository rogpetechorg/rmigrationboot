package dev.skill.rigboot.commandline;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name="migrate",
  mixinStandardHelpOptions=true,
  description="Migrate the database",
  version="1.0")
public class MigrationCLI implements Runnable {
  
  @Override
  public void run() {
    System.out.println("Migrating the database...");
  }
  
  public static void main(String[] args) {
    int exitCode = new CommandLine(new MigrationCLI()).execute(args);
    System.exit(exitCode);
  }
  
}
