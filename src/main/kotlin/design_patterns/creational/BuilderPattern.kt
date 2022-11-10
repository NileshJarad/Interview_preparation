package design_patterns.creational



fun main() {
    val url1 = Url.Builder()
        .protocol("https://")
        .hostName("www.google.com")
        .portNumber(":444")
        .build()

    print(url1.protocol)
    print(url1.hostName)
    print(url1.portNumber)


    println()

    val url2 = Url.Builder()
        .protocol("https://")
        .hostName("www.google.com")
        .build()

    print(url2.protocol)
    print(url2.hostName)


}





class Url {
    var protocol: String = ""
    var hostName: String = ""
    var portNumber: String = ""
    var queryParam: String = ""

    class Builder {
        private var protocol: String = ""
        private var hostName: String = ""
        private var portNumber: String = ""
        private var queryParam: String = ""

        fun protocol(protocol: String): Builder {
            this.protocol = protocol
            return this
        }

        fun hostName(hostName: String): Builder {
            this.hostName = hostName
            return this
        }

        fun portNumber(portNumber: String): Builder {
            this.portNumber = portNumber
            return this
        }

        fun queryParam(queryParam: String): Builder {
            this.queryParam = queryParam
            return this
        }

        fun build(): Url {
            return Url(this)
        }

        private fun Url(builder: Builder): Url {
            return Url().apply {
                protocol = builder.protocol
                hostName = builder.hostName
                portNumber = builder.portNumber
                queryParam = builder.queryParam
            }
        }
    }
}