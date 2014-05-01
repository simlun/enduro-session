# enduro-session

A Clojure library designed to provide the simplest form of durable [Ring][ring]
[session store][store.clj]. It is basically a clone of the original [in-memory
session store][memory.clj] with the `atom` replaced by Alan Dipert's durable
[enduro][enduro] `file-atom`.

## Usage

FIXME

## License

Copyright © 2014 Simon Lundmark

Distributed under the Eclipse Public License either version 1.0 or (at your
option) any later version.


[ring]: https://github.com/ring-clojure/ring/
[store.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/store.clj
[memory.clj]: https://github.com/ring-clojure/ring/blob/1.2.1/ring-core/src/ring/middleware/session/memory.clj
[enduro]: https://github.com/alandipert/enduro
