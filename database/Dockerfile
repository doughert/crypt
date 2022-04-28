FROM postgres:12.2
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres_adm
ENV POSTGRES_DB postgres
RUN mkdir -p /tablespace/data
RUN mkdir -p /tablespace/index
RUN chown -R postgres:postgres /tablespace
RUN chmod 777 /tablespace/data
RUN chmod 777 /tablespace/index
ADD initial.sql /docker-entrypoint-initdb.d/