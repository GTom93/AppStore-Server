package edu.inf.store.service

import edu.inf.store.domain.Game
import edu.inf.store.repository.GameRepository
import edu.inf.store.service.dto.GameDto
import edu.inf.store.service.mapper.EntityMapper
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
@Transactional
class GameService(entityRepository: GameRepository, entityMapper: EntityMapper<Game, GameDto>) : EntityService<Game, GameDto, GameRepository>(entityRepository, entityMapper) {

    companion object {
        private val log: Logger = LoggerFactory.getLogger(GameContentService::class.java)
    }

    @Transactional(readOnly = true)
    fun findAllWithoutChildren(): List<GameDto> {
        log.debug("Request to get all {}", getEntityName())
        return entityRepository.findAll().map { entityMapper.toDtoWithoutChildren(it) }
    }
}