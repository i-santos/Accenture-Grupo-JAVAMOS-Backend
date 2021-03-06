package com.accenture.javamos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserResponse {
  private final boolean success;
  private final String message;
  private final String userEmail;
}
