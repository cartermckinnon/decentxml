package de.pdark.decentxml.mapping;

public class MappingException extends RuntimeException {

  public MappingException() {
    super();
  }

  public MappingException(String message, Throwable cause) {
    super(message, cause);
  }

  public MappingException(String message) {
    super(message);
  }

  public MappingException(Throwable cause) {
    super(cause);
  }
}
