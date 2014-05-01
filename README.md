# enduro-session

A Clojure library designed to provide the simplest form of durable [Ring][ring]
[session store][store.clj]. It is basically a clone of the original [in-memory
session store][memory.clj] with the `atom` replaced by Alan Dipert's durable
[enduro][enduro] `file-atom`.

[![Build Status](https://travis-ci.org/simlun/enduro-session.svg?branch=master)](https://travis-ci.org/simlun/enduro-session)


## Usage

FIXME


## Development

Run tests using [Midje][midje]: `$ lein midje` or automatically on source code file
change: `$ lein midje :autotest`.


## License

Copyright © 2014 Simon Lundmark

Distributed under the Eclipse Public License either version 1.0 or (at your
option) any later version.


[ring]: https://github.com/ring-clojure/ring/
[store.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/store.clj
[memory.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/memory.clj
[enduro]: https://github.com/alandipert/enduro
[midje]: https://github.com/marick/Midje
