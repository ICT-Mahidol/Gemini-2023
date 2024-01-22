# Requirements of the Gemini Project

This included **Functional Requirements** and **Non-Functional Requirements** of the Gemini Project, written in the form of EARS.

## User-Level Requirements

There are **5 classes of users** with different needs of the system. User interfaces for different access levels should be uniform across all subsystems, though different access levels should present different __‘look-and-feels’__.

|Class	|Operation Level |Access Mode	|User Interface
|-------|------|------------|--------------
|Astronomer|Observing|Planning, observing, monitoring|Simple, safe, controls grouped for convenience of observation activity.
|Science Observer|Observing|Observing, monitoring|Same as for astronomer.
|Telescope Operator|Observing, maintenance, test|Observing, monitoring, operation, testing|Organized for ease of control and quick response to unsafe conditions, ability to monitor all subsystems as needed.
|Support|Maintenance, test|Monitoring, operation, testing|Must allow full access to all subsystems.
|Developer|Maintenance, test|Monitoring, testing|Must allow full access to each subsystem in test.
|Administrator|Observing, maintenance, test|Monitoring, administrative|Simple, safe, status inquiries only.



To fulfill the needs, requirements that needs to be achieved are devided by classes below.

### 1. Astronomers and Science Observer

#### Fuctional Requirements

- The **System** shall facilitate on-line assessment of data quality.
- The **User Interface** shall allow users to acquire astronomical data.
- The **System** shall support an execution queue for scheduling commands, allowing later execution.
- The **User Interface** shall allow users to submit observing commands into the execution queue, including the commands to break or resequence the queue.

#### Non-Funtional Requirements

- **Traditional Interactive Operation** shall be replaced by operation via an automatic sequencer.
- The **Scheduling Queue** shall be transparent to the on-site observer during the initial phases of telescope operation.
- The **User Interface** shall be simple, safe and convenience for observation activities.
- The **System** shall not provide observers the privileges for direct control of the telescope.
- **Certain functions**, like adjusting spectrograph slit width for seeing conditions, must require interactive capability.

### 2. Operations Staff

#### Fuctional Requirements

- The **User Interface** shall allow users to interact with a scheduler program and direct command execution.
- The **System** shall allow users access to operation tables in update mode.
- The **System** shall allow users to change the operational status of units based on test results.
- The **System** shall allow users to monitor general performance and ensure system safety.

#### Non-Funtional Requirements

- While **Subsystems** are in normal operation, the system shall not allow users access to subsystems.
-  The **System** shall provide users privileges to access all commands and maintenance procedures in case of problems.

### 3. Software Developmant and Maintenance Staff

#### Fuctional Requirements

- When there is a major problem to be solved or an upgrade to be installed, the **System** shall allow users to intervene.
- The **System** shall allow users to perform system generation and installation of new software packages or releases.
- The **System** shall allow users to work at the test level for the part of the software under test.
- The **System** shall facilitating integration tests by running relevant parts of the system in test mode.

#### Non-Funtional Requirements

-  The **System** shall provide users the highest privilege to modify everything in the system.
- **Some Commands** are available for testing hardware, which are not accessible to observing astronomers.
- **Configuration Control** must follow a strict guideline to prevent interference with ongoing normal operation.

## General Requirements

The

## Specific Requirements

The