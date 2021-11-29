package com.fuji.limit_resource;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder(toBuilder = true)
@Setter
@Getter
public class LimitResponse {

   private String result;
}
