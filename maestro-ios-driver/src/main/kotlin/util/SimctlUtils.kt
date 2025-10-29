package util

object SimctlUtils {
    /**
     * Returns the base arguments for calling `simctl`.
     *
     * The caller should pass an explicit deviceSet when available. If `deviceSet` is null or blank
     * we call simctl without `--set` which uses the system default device set.
     */
    fun simctlBaseArgs(deviceSet: String? = null): List<String> {
        val customSet = deviceSet
        return if (customSet.isNullOrBlank()) listOf("xcrun", "simctl")
        else listOf("xcrun", "simctl", "--set", customSet)
    }
}
