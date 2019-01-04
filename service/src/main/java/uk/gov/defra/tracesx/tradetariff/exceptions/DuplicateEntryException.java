package uk.gov.defra.tracesx.tradetariff.exceptions;

import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateEntryException extends Exception {
  private Long entryId;

  public DuplicateEntryException() {}

  public DuplicateEntryException(Long entryId) {
    this.entryId = entryId;
  }

  public Long getEntryId() {
    return entryId;
  }

  public void setEntryId(Long entryId) {
    this.entryId = entryId;
  }
}
