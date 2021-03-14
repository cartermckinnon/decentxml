package de.pdark.decentxml.mapping;

import de.pdark.decentxml.Node;

public class NopHandler implements INodeHandler {
  public void handle(Node node) {
    // Do nothing
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
