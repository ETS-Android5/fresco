/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.vito.core;

import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.STRICT)
public interface PrefetchConfig {

  boolean prefetchInOnPrepare();

  PrefetchTarget prefetchTargetOnPrepare();

  boolean cancelOnPreparePrefetchWhenWorkingRangePrefetch();

  boolean cancelPrefetchWhenFetched();

  boolean prefetchWithWorkingRange();

  int prefetchWorkingRangeSize();

  PrefetchTarget prefetchTargetWorkingRange();

  boolean prioritizeWithWorkingRange();
}
