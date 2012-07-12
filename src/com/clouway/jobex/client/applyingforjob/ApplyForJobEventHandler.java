package com.clouway.jobex.client.applyingforjob;

import com.google.gwt.event.shared.EventHandler;

/**
 * An implementation of this Class is responsible for Handling ApplyForJobEvent
 * which is flush when the user applies for job.
 *
 * @author Adelin Ghanayem adelin.ghanaem@clouway.com
 */
public interface ApplyForJobEventHandler extends EventHandler {
  /**
   * Handles ApplyForJobEvent
   *
   * @param event the event to be handled
   */
  void onApplyForJob(ApplyForJobEvent event);
}
