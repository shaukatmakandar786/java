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
