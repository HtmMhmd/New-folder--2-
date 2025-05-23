package com.swaglabs.tests;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

/**
 * Test suite that runs all Swag Labs test classes
 */
@Suite
@SelectPackages("com.swaglabs.tests")
public class AllTests {
    // This class serves as a test suite container
    // The actual test classes are selected by the @SelectPackages annotation
}
