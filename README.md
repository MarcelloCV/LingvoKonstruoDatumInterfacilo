## Preface
An all-round data storage alternatives and interfaces for the creation of constructed language, and in the future, as well as proramming language.
The name of this repo (where "lingvo": "language", "konstruo": "construction", "datumoj": "data", "interfacoj": "interfaces", "-ilo": "tool") is derived from a constructed language (conlang) namely `Esperanto`. This repo's name will later be changed to my own conlang words for it.

## Overview
Dependency that being used is `ANTLR v4.13.1`, which is a powerful library that can automatically generate the supporting classes from `syntax.g4` file (located in the same directory as the g4 file [`resources`]), which allows to construe an input sentence and also to build the language syntax, meanwhile it's corresponding semantic is handled by `Java Hashmap` to combine them altogether into vocabulary records that will be stored in `semantic.json` file. The `ConsoleInterface.java` file that is under `personal` package plays a role in ensuring that both files are in accordance with each other.

## Notes
Most of the files are intentionally empty as they fall under to-do list for the project (See section `Projects` of this repo for reference). Also, some files, like `ConsoleInterface.java`, only displays the class, variable, and method signatures, excluding the implementations until a cleaner yet more stable version is ready.
