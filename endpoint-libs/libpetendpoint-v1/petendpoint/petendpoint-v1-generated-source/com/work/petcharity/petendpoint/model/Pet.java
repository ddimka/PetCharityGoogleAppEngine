/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-06-30 15:48:57 UTC)
 * on 2014-07-12 at 07:43:45 UTC 
 * Modify at your own risk.
 */

package com.work.petcharity.petendpoint.model;

/**
 * Model definition for Pet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the petendpoint. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Pet extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deathDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kalbiya;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moneyHave;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moneyNeeded;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String petName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String picture;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDeathDate() {
    return deathDate;
  }

  /**
   * @param deathDate deathDate or {@code null} for none
   */
  public Pet setDeathDate(java.lang.String deathDate) {
    this.deathDate = deathDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public Pet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Pet setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKalbiya() {
    return kalbiya;
  }

  /**
   * @param kalbiya kalbiya or {@code null} for none
   */
  public Pet setKalbiya(java.lang.String kalbiya) {
    this.kalbiya = kalbiya;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMoneyHave() {
    return moneyHave;
  }

  /**
   * @param moneyHave moneyHave or {@code null} for none
   */
  public Pet setMoneyHave(java.lang.String moneyHave) {
    this.moneyHave = moneyHave;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMoneyNeeded() {
    return moneyNeeded;
  }

  /**
   * @param moneyNeeded moneyNeeded or {@code null} for none
   */
  public Pet setMoneyNeeded(java.lang.String moneyNeeded) {
    this.moneyNeeded = moneyNeeded;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPetName() {
    return petName;
  }

  /**
   * @param petName petName or {@code null} for none
   */
  public Pet setPetName(java.lang.String petName) {
    this.petName = petName;
    return this;
  }

  /**
   * @see #decodePicture()
   * @return value or {@code null} for none
   */
  public java.lang.String getPicture() {
    return picture;
  }

  /**

   * @see #getPicture()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePicture() {
    return com.google.api.client.util.Base64.decodeBase64(picture);
  }

  /**
   * @see #encodePicture()
   * @param picture picture or {@code null} for none
   */
  public Pet setPicture(java.lang.String picture) {
    this.picture = picture;
    return this;
  }

  /**

   * @see #setPicture()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Pet encodePicture(byte[] picture) {
    this.picture = com.google.api.client.util.Base64.encodeBase64URLSafeString(picture);
    return this;
  }

  @Override
  public Pet set(String fieldName, Object value) {
    return (Pet) super.set(fieldName, value);
  }

  @Override
  public Pet clone() {
    return (Pet) super.clone();
  }

}
