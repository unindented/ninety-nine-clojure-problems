# Ninety-Nine Clojure Problems [![Build Status](https://img.shields.io/travis/unindented/ninety-nine-clojure-problems.svg)](http://travis-ci.org/unindented/ninety-nine-clojure-problems)

My attempt at solving the [Ninety-Nine Lisp Problems](http://www.ic.unicamp.br/~meidanis/courses/mc336/2006s2/funcional/L-99_Ninety-Nine_Lisp_Problems.html) in Clojure.


## Getting started

I just used [leiningen](http://leiningen.org/) to create the project:

```
$ lein new ninety-nine-clojure-problems
$ cd !$
```


## Testing

To run all tests:

```
$ lein test
```


## Linting

I added a bunch of linters to this project, for educational purposes:

```
$ lein cljfmt check
$ lein bikeshed
$ lein kibit
$ lein eastwood
```


## Meta

* Code: `git clone git://github.com/unindented/ninety-nine-clojure-problems.git`
* Home: <https://github.com/unindented/ninety-nine-clojure-problems/>


## Contributors

* Daniel Perez Alvarez ([unindented@gmail.com](mailto:unindented@gmail.com))


## License

Copyright (c) 2015 Daniel Perez Alvarez ([unindented.org](https://unindented.org/)). This is free software, and may be redistributed under the terms specified in the LICENSE file.
