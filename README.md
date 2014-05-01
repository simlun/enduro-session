# enduro-session

A Clojure library designed to provide the simplest form of durable [Ring][ring]
[session store][store.clj]. It is basically a clone of the original [in-memory
session store][memory.clj] with the `atom` replaced by Alan Dipert's durable
[enduro][enduro] `file-atom`.

[![Build Status](https://travis-ci.org/simlun/enduro-session.svg?branch=master)](https://travis-ci.org/simlun/enduro-session)


## Usage

Dependency:

    [simlun/enduro-session "0.1.0"]

Ring middleware:

    (use 'ring.adapter.jetty
         '[simlun.enduro-session :only [wrap-enduro-session]])

    (defn handler [request]
    ; ...
    )

    (run-jetty (wrap-enduro-session handler) {:port 3000}))


## Development

The main entry point is the `Makefile` which will run all tests on `$ make`.


## License

Copyright © 2014 Simon Lundmark

Distributed under the Eclipse Public License either version 1.0 or (at your
option) any later version.


[ring]: https://github.com/ring-clojure/ring/
[store.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/store.clj
[memory.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/memory.clj
[enduro]: https://github.com/alandipert/enduro
[midje]: https://github.com/marick/Midje
