import logging
from fileinput import filename

logging.basicConfig(filename="mylog.log",level=logging.ERROR)
logging.critical("Critical")
logging.error("Error")
logging.warning("Warn")
logging.info("Info")
logging.debug("Debug")
