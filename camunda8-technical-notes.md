# Camunda-8 Technical Notes:

## Required Dependencies:

### 1 spring-zeebe-starter (Zeebe Client):

    <dependency>
      <groupId>io.camunda</groupId>
      <artifactId>spring-zeebe-starter</artifactId>
      <version>1.2.1</version>
    </dependency>

### Purpose:

=> This Spring Boot Starter helps integrate Zeebe, the workflow engine of Camunda 8.

=> It allows your application to:

=> Deploy BPMN process models to Zeebe.

=> Start new process instances.

=> Handle service tasks as a worker (by subscribing to task types).

=> Communicate with Zeebe brokers.

### How It Works:

=> It automatically configures a Zeebe Client inside your Spring Boot app.

=> You can create workers that listen for Zeebe tasks:

      @ZeebeWorker(type = "my-task")
      public void handleJob(final JobClient client, final ActivatedJob job) {
          System.out.println("Processing job: " + job);
          client.newCompleteCommand(job.getKey()).send();
      }

