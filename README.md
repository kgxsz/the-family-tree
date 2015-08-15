# The Family Tree

#####A visualisation of my family data spanning five generations - see it live [here](http://the-family-tree.divshot.io/).
[![Build Status](https://travis-ci.org/kgxsz/the-family-tree.svg?branch=master)](https://travis-ci.org/kgxsz/the-family-tree)

## Introduction
This is a simple visualisation that I built around extensive family data going back five generations. I made this to get a grasp of interop with JavaScript libraries, such as d3.js through ClojureScript. I also wanted to have some fun with d3.js and some not-so-generic data.

## Local development setup

- You will need to install [Boot](https://github.com/boot-clj/boot#install).
- For a no frills build: `boot build`. You will find the assets in the `target/` directory.
- To serve those assets: `boot serve`.
- Run `boot dev` to get a development environment going.
- Do `boot repl --client` then `(start-repl)` to start the browser connected repl.
