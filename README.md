# The Family Tree

#####A set of visualisations on my family data spanning five generations.

## Local development setup

- You will need to install [Boot](https://github.com/boot-clj/boot#install).
- For a no frills build: `boot build`. You will find the assets in the `target/` directory.
- To serve those assets: `boot serve`.
- Run `boot dev` to get a development environment going.
- Do `boot repl --client` then `(start-repl)` to start the browser connected repl.

### TODO
- Try declaring nodes beforehand, then draw them up. [done]
- Tighten up the colour key, such that flashing doesn't occur, perhaps use groupings. [done]
- Can you highlight the key name as you hover to give it an adequate response? [done]
- Treat scale derived data as true data or auxiliary data? [done]
- How do you deal with colour scales properly? [done]
- Other families should work as well. [done]
- Small fix ups with text colouring. [done]
- Object key section.
- Use a scale to position key elements? [done]
- Deploy it.
- Clean up the way the legend and keys are built. [done]
- Figure out why advanced closure compile fails.
