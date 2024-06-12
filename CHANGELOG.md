# Changelog

## [1.0.1] - 2024-06-11


### Changed
* Downgrade to support Java 8 (from 21).

### Fixed

- Fix `StringParser#parseBit(String)` parsing input values `"true"` and `"false"` instead of `"0"` and `"1"`
- `CollectionParser#parseBits(Collection<String>)` parsing input values `"true"` and `"false"` instead of `"0"` and `"1"`
