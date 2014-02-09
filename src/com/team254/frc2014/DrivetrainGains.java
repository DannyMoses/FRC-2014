package com.team254.frc2014;

import com.team254.lib.StateSpaceGains;

public class DrivetrainGains {
  static public StateSpaceGains[] getGains() {
    return new StateSpaceGains[] {
        new StateSpaceGains(
            new double[] {1.000000, 0.009314, 0.000000, 0.000005, 0.000000, 0.865972, 0.000000, 0.000896, 0.000000, 0.000005, 1.000000, 0.009314, 0.000000, 0.000896, 0.000000, 0.865972},  // A
            new double[] {0.000127, -0.000001, 0.024748, -0.000165, -0.000001, 0.000127, -0.000165, 0.024748},  // B
            new double[] {1.000000, 0.000000, 0.000000, 0.000000, 0.000000, 0.000000, 1.000000, 0.000000},  // C
            new double[] {0.000000, 0.000000, 0.000000, 0.000000},  // D
            new double[] {1.705972, 0.000896, 66.315855, 0.117713, 0.000896, 1.705972, 0.117713, 66.315855},  // L
            new double[] {240.432226, 14.365912, 1.606985, 0.132422, 1.606985, 0.132422, 240.432226, 14.365912},  // K
            new double[] {12.000000, 12.000000},  // Umax
            new double[] {-12.000000, -12.000000}),  // Umin
        };
  }
}