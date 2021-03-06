/*
 * Copyright (c) 2008, Aaron Digulla
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *     * Neither the name of Aaron Digulla nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package de.pdark.decentxml;

public class Namespace {
  public static final String NS_PREFIX = "xmlns:";
  public static final String DEFAULT_NAMESPACE = "xmlns";

  public static final Namespace NO_NAMESPACE = new Namespace("", "");
  public static final Namespace XML_NAMESPACE =
      new Namespace("xml", "http://www.w3.org/XML/1998/namespace");

  private String prefix;
  private String uri;

  public Namespace(String prefix, String uri) {
    if (prefix == null) throw new IllegalArgumentException("prefix is null");
    if (uri == null) throw new IllegalArgumentException("uri is null");

    this.prefix = prefix;
    this.uri = uri;
  }

  public String getPrefix() {
    return prefix;
  }

  public String getURI() {
    return uri;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) return false;

    if (!(obj instanceof Namespace)) return false;

    Namespace ns = (Namespace) obj;
    return prefix.equals(ns.getPrefix()) && uri.equals(ns.getURI());
  }

  @Override
  public String toString() {
    return "Namespace " + prefix + ":" + uri;
  }
}
