SUMMARY = "Layer for building nbtscan CLI tool"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/resurrecting-open-source-projects/nbtscan/"

SRCREV = "83a89ae53b536df78e1d98e13e1b1932701241d0"

S = "${WORKDIR}/git"

inherit autotools

RPROVIDES_${PN} += "nbtscan"
