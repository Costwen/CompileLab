FROM frolvlad/alpine-gxx
WORKDIR /app/
COPY lab01/Lex.cpp ./
RUN g++ lab01/Lex.cpp -o Lex
RUN chmod +x Lex
