package util

object SimctlUtils {
    /**
     * Returns the base arguments for calling `simctl`.
     *
     * The caller should pass an explicit iosDeviceSet when available. If `iosDeviceSet` is null or blank
     * we call simctl without `--set` which uses the system default device set.
     */
    fun simctlBaseArgs(iosDeviceSet: String? = null): List<String> {
        val customSet = iosDeviceSet
        return if (customSet.isNullOrBlank()) listOf("xcrun", "simctl")
        else listOf("xcrun", "simctl", "--set", customSet)
    }
}
