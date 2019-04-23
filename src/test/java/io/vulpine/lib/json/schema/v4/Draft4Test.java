package io.vulpine.lib.json.schema.v4;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Draft4Test
{
  private static final ObjectMapper JSON = new ObjectMapper();
  private Draft4 test;

  @BeforeEach
  void setUp()
  {
    test = new Draft4(JSON);
  }

  @Test
  void getMapper()
  {
    assertSame(JSON, test.getMapper());
  }

  @Test
  void builder()
  {
    assertNotNull(test.builder());
  }

  @Test
  void newBuilder()
  {
    assertNotNull(Draft4.newBuilder());
  }
}
