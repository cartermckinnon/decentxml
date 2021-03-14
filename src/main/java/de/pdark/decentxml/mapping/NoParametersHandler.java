package de.pdark.decentxml.mapping;

import de.pdark.decentxml.Node;
import java.lang.reflect.Method;

public class NoParametersHandler implements INodeHandler {
  private final Object handler;
  private final Method method;

  public NoParametersHandler(Object handler, Method method) {
    this.handler = handler;
    this.method = method;
  }

  public void handle(Node node) {
    try {
      method.invoke(handler);
    } catch (Exception e) {
      throw new MappingException(node + ": Error invoking " + method + " on " + handler);
    }
  }

  @Override
  public String toString() {
    return super.toString() + "(handler=" + handler + ", method=" + method + ")";
  }
}
