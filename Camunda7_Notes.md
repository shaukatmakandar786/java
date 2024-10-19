# Camunda7

## What is BPM (Business Process Management):
Business process management (BPM) is the practice of modeling, analyzing, and optimizing end-to-end business processes to help meet your strategic business goals, such as the improvement of your customer experience framework. BPM methodology can be applied to tasks and processes that are often repeated, ongoing, or predictable.

A business process is a set of activities that help a business reach a specific goal. Using BPM, you can evaluate your existing processes to find ways to improve efficiency, reduce costs and errors, and support digital transformation efforts.  

## What is BPMN (Business Process Modeling and Notation) :

Business Process Model and Notation (BPMN) is a standard way to represent business processes graphically using a flowchart. BPMN is used to model the steps of a business process from start to finish, including the flow of data, activities, and information.

BPMN is a key part of business process management (BPM). It's used by business owners and technical users to: Create consistent process documentation

## What is Camunda

Camunda is an open-source platform for business process automation, focusing on workflow and decision automation. It helps organizations model, automate, and optimize business processes. Camunda is widely used to orchestrate complex business workflows across multiple systems.

### Key Features of Camunda:
BPMN 2.0 Engine: Camunda supports BPMN (Business Process Model and Notation), a widely-used standard for defining business processes visually, allowing process diagrams to be executed.

1. DMN Engine: The platform includes a Decision Model and Notation (DMN) engine to automate decision-making logic, allowing for rule-based decision automation.

2. CMMN Engine: It also supports Case Management Model and Notation (CMMN) for case management scenarios where processes aren't strictly linear or predictable.

3. Spring Boot Integration: Camunda integrates easily with Spring Boot applications (like the one you mentioned you’re using). This allows you to embed the process engine directly into your Spring-based applications.

4. Task Management and Monitoring: Camunda provides tools for managing tasks, monitoring processes in real-time, and handling human tasks within workflows.

5. REST API: It offers a REST API for interacting with workflows, making it easy to trigger processes and decisions programmatically.

6. Highly Scalable: Camunda is designed to handle complex, high-throughput business processes, making it scalable for large enterprise use cases.

Camunda is popular in various industries, including finance, insurance, and logistics, to streamline workflows and automate repetitive tasks.

## History Time To Live(TTL) in application.yaml

With the recent version of Camunda Framework, it has now become mandatory to specify History Time To Live(TTL).
We already know that the Process Engine stores the information of all Process Instances, variables etc in the database.
History Time To Live (TTL) defines how long this historic data shall remain in the database before it is cleaned up.
We can specify TTL in application.yaml by adding following property:

      camunda:
   
        bpm:
      
          generic-properties:
      
            properties:
      
              historyTimeToLive: 5

## BPMN Core Elements:

1. Task
2. Events
3. Getways
4. Sequence flow
5. Message flow
6. Participants(Pool & Lane)
7. Associates
8. Annotation
9. Artifacts
10. Data Object
11. Data Group

## What is Task and Types of Task in Camunda:

a Task represents a unit of work within a business process and that can be performed either by a person, a system, or an external service.

1. User Task
A User Task is a task that requires manual action by a human user. It’s typically used for approval processes, form submission, or any activity where human interaction is necessary.

2. Service Task
A Service Task is used to automate a part of the business process by invoking some backend service, like a Java class, a REST API, or any other automated system.

3. Script Task
A Script Task executes a script or piece of code to automate part of the process. The script can be written in various scripting languages like JavaScript, Groovy, or Python.

4. Business Rule Task
A Business Rule Task is used to execute decision logic using DMN (Decision Model and Notation). This allows for externalizing business rules and decision-making from the process.

5. Send Task
A Send Task is used to send a message to another process, external system, or service. It’s typically used in message-based communication between processes.

6. Receive Task
A Receive Task is a task that waits for an external message before proceeding. It’s used when the process needs to be paused until an external event occurs.

7. Manual Task
A Manual Task represents a task that is performed manually but is not managed or tracked by the workflow engine. This could be physical tasks or tasks done outside the Camunda environment.

8. External Task
An External Task is used in the External Task pattern, where the task execution is delegated to an external worker that polls for tasks from the engine. This decouples task execution from the process engine.

9. Call Activity
A Call Activity allows you to call or trigger another BPMN process within a process. It is used to modularize processes by breaking them into smaller reusable components.

10. Subprocess (Expanded Task Type)
A Subprocess groups multiple tasks within a larger process. It acts as a container to encapsulate part of the workflow logic.

Types of Subprocesses:
Embedded Subprocess: A subprocess that is part of the parent process and is expanded in the model.
Event Subprocess: A subprocess triggered by an event.

## Sequence Flow:

It represents the flow of control from one element (like a task, event, or gateway) to the next, indicating the path that the process will follow.

### Types of Sequnce Flow:

1. Sequence Flow
2. Conditional Flow
3. Default Flow

## Getway in Camunda:

In Camunda, gateways are used to control the direction of a process by deciding which path to follow. They don't perform tasks themselves but simply guide the flow based on conditions or logic.

### Exclusive Getway:
An Exclusive Gateway in Camunda is used to make decisions where only one path can be followed. It checks the conditions on each outgoing flow and selects the first one that is true. If none of the conditions match, it can follow a default path if defined.

If none of the conditions match and there is no default path it throws runtime exception (Error: No outgoing sequence flow for the element with id 'Gateway_1ulvr0y' could be selected for continuing the process.)

1. Diverging Exclusive Gateway:
   It is used to split the process flow into multiple paths, but only one path will be executed based on conditions.

2. Converging Exclusive Gateway:
   It is Used to merge multiple incoming paths back into one. It waits for one of the paths to complete and then continues the process.

### Parallel Getway:
A Parallel Gateway in Camunda is used to execute all the path which is defined simultaniously. It does not check any condition to execute   

1. Diverging Parallel Gateway:
   It is used to split the process flow into multiple paths, and its executes all the path without checking any condition

2. Converging Parallel Gateway:
   It is Used to merge multiple incoming paths back into one. It waits untill all the paths will not be complete its execution then continues the process.

### Inclusive Getway:
Its an combination of exclusive and parallel getways.
An Inclusive Gateway in Camunda is used to make decisions where multiple path can be followed. It checks the conditions on each outgoing flow and selects the whatever is true. If none of the conditions match, it can follow a default path if defined.

1. Diverging Parallel Gateway:
   It is used to split the process flow into multiple paths, and its executes all the path which matches the condition

2. Converging Parallel Gateway:
   It is Used to merge multiple incoming paths back into one. It waits untill all the paths will not be complete its execution only when more than one condition is true. If only one condition is true it wont wait continues the process.

### Event-Based Getway:

In Camunda BPM, an Event-Based Gateway is used to model scenarios where the process flow branches out based on which event occurs first. It allows the process to wait for one or more possible events and proceed with the one that happens first.

In sequence flow After Event-Based based getway we can have only events like timer or conditional event, which will execute first it goes to that path. Mean it will works with event only.

## What is Subprocess Call Activity:

A Subprocess Call Activity particularly in Camunda, is a way to reuse an entire process inside another process. It allows one process to call and execute a separate, reusable subprocess as part of the main workflow. This is useful for breaking down complex processes into smaller, manageable parts or for reusing common process logic across multiple workflows.

To integrate subprocess into main workflow we have to add subprocess id to the called element in the call activity task

we can use variables and object of one process to another process using In Mappings and out Mappings in call Activity

## Embedded Subprocess:

An Embedded Subprocess in Camunda is a way to group tasks within the same process for better organization. Unlike a Call Activity, it is part of the main process and cannot be reused in other processes.

## DMN 
(Decision Model and Notation) is a standard for modeling and automating business decisions. In Camunda, DMN lets you define business rules, like decision tables, separately from workflows. This makes it easy to manage, automate, and update decisions without changing your code. For example, you can use DMN to check if a loan applicant is eligible based on their age and income, and Camunda will automatically apply those rules during process execution.

To integrate DMN table to Business Rule task we add DMN id to Business Rule Decision_reference in the implementation section and also we select type as DMN in the same section.

In Business Rule implementation section we have Map decision result drop down there we can select what type of value we will be getting from DMN and we can store it in Result Variable. Map decision result drop down is having SingleEntry, SingleResult, ResultList etc.

In DMN table we can add Expression, Expression Language, type, Input variable, Output name, type

1. Unique
2. Any
3. First
4. Rule Order
5. Collect
6. Priority
7. Output Order

### Unique:
Only one rule should match int the given rule. If more than one rule matches, it will raise an error.
### Any
Multiple rules can match, but all the rules must return the same result. If they return different results, it will cause an error.
### First
Multiple rules can match, but the first matching rule is applied, based on the order of rules in the table
### Rule Order
All matching rules are executed in the order they appear in the table, and all results are returned.
### Collect
All matching rules are executed and order they appear in the table does not considered, and the results are collected. You can specify aggregation functions like SUM, MIN, MAX, COUNT.
### Priority
If multiple rules match, the rule with the highest priority output (as defined in the table) is selected.
### Output Order
All matching rules are executed, and the results are returned based on a predefined order of output.

## Multi-Instance:

In Camunda, multi-instance is a feature that allows a BPMN activity (such as a task, subprocess, or call activity) to be executed multiple times, either in parallel or sequentially. It is particularly useful when you need to process a collection of items (e.g., a list of orders, a group of users, or any repetitive task) within a workflow.

### Key Concepts of Multi-Instance in Camunda:

#### Sequential vs Parallel Execution:

1. Sequential: The activity is executed multiple times, but one after another. The process will wait for each instance to complete before starting the next.
2. Parallel: Multiple instances of the activity are executed simultaneously, and the process will wait for all of them to complete before proceeding.

#### Collection:

The multi-instance activity is typically tied to a collection (e.g., a list of items or a number of repetitions). This collection is a process variable, such as a list of objects, that the process iterates over.
Each instance of the activity will be executed for a separate element in the collection.

#### Element Variable:

For each iteration of the multi-instance activity, you can define an element variable that will hold the value of the current element from the collection. This allows you to work with the individual item during that specific instance of the activity.

#### Completion Condition:

You can define a completion condition to stop the execution of further instances before all iterations have been completed. This is helpful if, for example, a condition is met halfway through, and you no longer need to continue the remaining instances.


## Event In Camunda:

In Camunda BPM, Events are things that happen during a process, like when it starts, moves forward, or finishes. Events can either:

Trigger actions (like starting or stopping the process), or
Make the process wait for something to happen (like receiving a message or waiting for a timer).

1. We have different types of event in camunda like start, intermediate, end
2. In intermediate event we are having (Boundry Event and Non-Boundry Event)
3. Boundry Event can have (interrupted Event and Non Interrupted Event)
4. Non-Boundry Event can have (throw event and catch event)

### Events:

1. start Event
2. end event
3. terminated end event
4. timer event
5. conditional event
6. Message event
7. link event
8. Error event
9. Esclation event
10. signal event

## Listeners:

In Camunda, Listeners let you run specific actions when certain events happen during a process. They allow you to add custom behavior to tasks or other process steps, like sending notifications or updating data when a task starts, finishes, or is assigned to someone.

### Types of Listeners:

1. Task Listener: Runs actions when events happen in user tasks (e.g., when a task is created, assigned, or completed). In Task Listener we are having Event Type (create, aasingment, complete, delete, update, timeout) and Listener type (Java class, Delegate Expression, expression, Script)
2. Execution Listener: Runs actions during the execution of process elements (e.g., when a process starts, ends, or transitions). In Execution Listener we are having Event Type (start, end) and Listener type (Java class, Delegate Expression, expression, Script)
