# spring-scheduler-with-shedlock
A sample to demonstrate Spring-Scheduler with Shedlock

1. docker-compose
Create a sample DB with docker-compose up -d.

2. Flyway Script
The flyway script creates the required shedlock table.

3. ShedLockConfig
Provides the required config for Enabling Spring Scheduler and Shedlock.
Also, create the required LockProvider bean required for Shedlock.

4. ScheduledCurrentTimeTask

The sample tasks with Shedlock.

https://medium.com/@suchit.g/use-spring-scheduler-in-clustered-environment-9de27251763f

