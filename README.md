# The Family Tree

#####A set of visualisations on my family data spanning five generations.

## Local development setup

- You will need to install [Boot](https://github.com/boot-clj/boot#install).
- For a no frills build: `boot build`. You will find the assets in the `target/` directory.
- To serve those assets: `boot serve`.
- Run `boot dev` to get a development environment going.
- Do `boot repl --client` then `(start-repl)` to start the browser connected repl.

### TODO
1) Try declaring nodes beforehand, then draw them up. [done]
2) Tighten up the colour key, such that flashing doesn't occur, perhaps use groupings. [done]
3) Can you highlight the key name as you hover to give it an adequate response? [done]
4) Treat scale derived data as true data or auxiliary data? [done]
5) How do you deal with colour scales properly? [done]
6) Other families should work as well. [done]
7) Small fix ups with text colouring. [done]
8) Object key section.
9) Use a scale to position key elements? [done]
10) Deploy it.
11) Clean up the way the legend and keys are built. [done]
12) Figure out why advanced closure compile fails.
