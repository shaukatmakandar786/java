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
## 2 camunda-tasklist-client-java (Tasklist Client):

    <dependency>
        <groupId>io.camunda</groupId>
        <artifactId>camunda-tasklist-client-java</artifactId>
        <version>1.5.2</version>
    </dependency>

### Purpose:

=> This dependency provides a Java client for interacting with Camunda Tasklist API.

=> Tasklist is used to manage human tasks in Camunda 8.

=> It allows your application to:

   - Fetch user tasks (e.g., assigned/unassigned tasks).

   - Complete tasks programmatically.

   - Claim or unclaim tasks.

   - Retrieve task variables.

### How It Works:

=> You can use the TasklistClient to fetch active tasks:

    TasklistClient client = TasklistClient.newClient()
    .tasklistUrl("http://localhost:8083")  // Replace with your Tasklist URL
    .build();

    List<Task> tasks = client.getTasks();
    tasks.forEach(task -> System.out.println("Task ID: " + task.getId()));

# Camunda Dependencies Summary

| Dependency | Purpose | Used For |
|------------|---------|----------|
| `spring-zeebe-starter` | Zeebe Client | Deploying BPMN, starting processes, handling service tasks |
| `camunda-tasklist-client-java` | Tasklist API Client | Fetching and completing human tasks |
