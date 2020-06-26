package com.sg.scheduler.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledCurrentTimeTask {

  private static final Logger log = LoggerFactory.getLogger(ScheduledCurrentTimeTask.class);

  private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

  @Scheduled(fixedRate = 5000)
  @SchedulerLock(name = "currentTimeTask", lockAtLeastFor = "5S", lockAtMostFor = "10M")
  public void currentTimeTask() {
    log.info("The time is now {}", dateFormat.format(new Date()));
  }

}
