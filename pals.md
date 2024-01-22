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

## Operational Context

The Gemini 8m Telescopes operation must deal with a complex environment produced by: 
- multi-telescope context 
- multi-instrument context
- visitor instrument context 
- multi-user context

### 1. Multi-Telescope Context 

#### Fuctional Requirements

- The **System** shall not support concurrent use of the two telescopes as if they were a single facility.

#### Non-Funtional Requirements

- The **System** shall be designed with the scalability and compatibility necessary to support collaboration with nearby telescopes in the long term.

### 2. Multi-Instrument Context 

#### Fuctional Requirements

- The **System** shall support the configuration of normally three scientific instruments mounted on the cassegrain focus of the telescope.
- **Parallel Access** to all mounted instruments shall be provided, though only one instrument has access to the telescope beam (active instrument).
- **Instruments that feed two detectors** by using beam splitters or field splitters shall be considered as a single active instrument.
- The **System** shall provide functionalities for calibration, hot standby, and operation at different levels for inactive instruments.

#### Non-Funtional Requirements

- The **System** shall ensure consistent operation of instruments across various operational levels (observing, maintenance, test).
-    The **System** shall facilitate efficient transitions between instruments, ensuring smooth switching of the telescope beam.
- **Inactive Instrument** shall not be allowed to adversely impact the active instrument.

### 3. Visitor Instrument Context 

#### Fuctional Requirements

- The **System** shall support the installation, operation, and support of outside instruments brought by the observer (visitor instruments).
- The subset of the **Available Functionality** shall be available through a standardized interface for visitor instruments.
- The **User Interface** for visitor instruments shall support acquisition of status information, preprogrammed observing sequences, and the capability to offset the telescope position and focus.
 - If feasible, the **User Interface** should provide support for coordinate transforms between visitor instrument and the Gemini system, archiving (or archivability) of visitor instrument data, and maintenance of operations tables.

#### Non-Funtional Requirements

- The **stability and long-lived nature** of the visitor instrument interface shall be emphasized to ensure reliable and consistent interactions.

### 4. Multi-User Context 

#### Fuctional Requirements

- The **System** shall allow users to access any part of the Gemini 8m Telescopes system from any location at the telescope site.
- The **System** shall allow multiple users to monitor the Gemini 8m Telescopes system simultaneously, with an active user in control and others observing relevant data.

#### Non-Funtional Requirements

- **Monitoring Activities** shall not adversely affect the performance of ongoing observations or operations.
- **Automatic Displays** of status information at different locations shall exist to facilitate continuous monitoring without explicit user interaction.

## General Requirements

The

## Specific Requirements

The