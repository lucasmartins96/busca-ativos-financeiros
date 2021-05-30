package com.project.bootcamp.exceptions;

import com.project.bootcamp.util.MessageUtils;

public class NotFoundExpection extends RuntimeException {
  public NotFoundExpection() {
    super(MessageUtils.NO_RECORDS_FOUND);
  }
}
