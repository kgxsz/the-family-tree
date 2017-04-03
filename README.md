# The Family Tree

##### A visualisation of my family data spanning five generations - see it live [here](https://the-family-tree.firebaseapp.com/).
[![Build Status](https://travis-ci.org/kgxsz/the-family-tree.svg?branch=master)](https://travis-ci.org/kgxsz/the-family-tree)

## Local development setup

- You will need to install [Boot](https://github.com/boot-clj/boot#install).
- For a no frills build: `boot build`. You will find the assets in the `target/` directory.
- To serve those assets: `boot serve`.
- Run `boot dev` to get a development environment going.
- Do `boot repl --client` then `(start-repl)` to start the browser connected repl.
