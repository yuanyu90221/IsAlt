fun isAlt(input: String): Boolean {
    // 找出所有沒有交替出先的 string, 也就是連續出現 vowel 或是 非 vowel 之外的字
    val nonAltReg = Regex("[aeiou]{2}|[^aeiou]{2}")
    return !nonAltReg.containsMatchIn(input)
}