package org.robolectric.shadows;

import android.os.SystemClock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.TestRunners;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(TestRunners.WithDefaults.class)
public class SystemClockTest {

  @Test
  public void shouldAllowForFakingOfTime() throws Exception {
    ShadowSystemClock.setFakeUptimeMillis(500);
    assertThat(SystemClock.uptimeMillis()).isEqualTo(500);
  }

  @Test
  public void shouldAllowUnfakingofTime() throws Exception {
    ShadowSystemClock.setFakeUptimeMillis(576726726L);
    ShadowSystemClock.unfakeUptimeMillis();
    assertThat(SystemClock.uptimeMillis()).isNotEqualTo(576726726L);
  }
}
