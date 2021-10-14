package com.example.retrofitrss.model

import com.example.retrofitrss.model.entry.Channel
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root
import java.io.Serializable



@Root(name = "rss", strict = false)
class RSS constructor() : Serializable {


    @field:Element( name = "channel")
    var channel:Channel?=null


}